package controller;

import model.element.robot.Robot;
import view.RobotView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TerminalController extends AbstractController {

    private static final Map<String, Integer> COMMANDS = new HashMap<>();

    private static final String DRAW = "draw";
    private static final String RANDOM = "random";
    private static final String AXIS = "axis";
    private static final String LIGHT = "light";
    private static final String ORBIT = "orbit";
    private static final String CLEAR = "clear";
    private static final String EXIT = "exit";

    static {
        COMMANDS.put(DRAW, 0);
        COMMANDS.put(RANDOM, 1);
        COMMANDS.put(AXIS, 1);
        COMMANDS.put(LIGHT, 1);
        COMMANDS.put(ORBIT, 1);
        COMMANDS.put(CLEAR, 0);
        COMMANDS.put(EXIT, 0);
    }

    private final Thread thread;

    public TerminalController(Robot model, RobotView view) {
        super(model, view);
        thread = new TerminalReader(this);
        thread.start();
    }

    private static void usage(String cmd, String args) {
        System.err.println("Usage : " + cmd + " " + args);
    }

    private void execute(String line) {

        String[] args = line.split(" ");

        if (args.length < 1) {
            return;
        }

        if (COMMANDS.get(args[0]) == null) {
            System.err.println("Unknown command " + args[0]);
            return;
        }

        if (COMMANDS.get(args[0]) != args.length - 1) {
            System.err.println("invalid argument number");
            return;
        }

        switch (args[0]) {

            case RANDOM:

                model.getJoints()[0].setValue(Double.parseDouble(args[1]));
                break;

            case DRAW:

                displayView();
                break;

            case LIGHT:

                if (args[1].equals("on")) {
                    view.addBackground();
                } else if (args[1].equals("off")) {
                    view.removeBackground();
                } else {
                    usage(LIGHT, "<on/off>");
                }
                break;

            case AXIS:

                if (args[1].equals("on")) {
                    view.addAxis();
                } else if (args[1].equals("off")) {
                    view.removeAxis();
                } else {
                    usage(AXIS, "<on/off>");
                }
                break;

            case ORBIT:

                if (args[1].equals("on")) {
                    view.addOrbitBehavior();
                } else if (args[1].equals("off")) {
                    view.removeOrbitBehavior();
                } else {
                    usage(ORBIT, "<on/off>");
                }
                break;

            case CLEAR:

                if (args.length == 2 && args[1].equals("all")) {
                    view.clearAll();
                } else {
                    view.clear();
                }
                break;

            case EXIT:
                System.exit(0);
                break;

            default:
                throw new IllegalStateException("");
        }
    }

    private static class TerminalReader extends Thread {

        private TerminalController controller;
        private BufferedReader reader;

        public TerminalReader(TerminalController controller) {
            this.controller = controller;
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        public void run() {

            System.out.println("-------------------------------------------------------------------------------------");

            while (!isInterrupted()) {

                try {

                    System.out.print(">>>");

                    String line = reader.readLine();

                    controller.execute(line);

                } catch (IOException e) {
                    break;
                }
            }
        }
    }
}