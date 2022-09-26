package codility;

import java.util.StringJoiner;

public class CodilityTaskBackbase {

    private final static String ROOT_PATH = "/";
    private final static String SLASH_SEPARATOR = "/";
    private final static String EMPTY = "";
    private final static String BACK_PATH = "..";

    public static String changeDirectoryString(String currentDirectory, String command) {

        validateCd(command);

        String commandWithoutCd = removeCdPrefix(command);

        if (ROOT_PATH.equals(commandWithoutCd)) {
            return ROOT_PATH;
        }

        if (commandWithoutCd.trim().startsWith("/")) {
            return commandWithoutCd;
        }

        StringJoiner pathJoiner = new StringJoiner(SLASH_SEPARATOR, SLASH_SEPARATOR, EMPTY);
        StringJoiner newPathDirectory = new StringJoiner(SLASH_SEPARATOR);

        String[] currentPathArray = getPathArray(currentDirectory);

        int currentDirectoryPosition = currentPathArray.length;

        for (String s : getPathArray(commandWithoutCd)) {
            if (s.equals(BACK_PATH)) {
                currentDirectoryPosition--;
            } else {
                newPathDirectory.add(s);
            }
        }

        for (int i = 0; i < currentDirectoryPosition; i++) {
            pathJoiner.add(currentPathArray[i]);
        }

        return pathJoiner.merge(newPathDirectory).toString();
    }

    private static String removeCdPrefix(String cd) {
        return cd.substring(3);
    }

    private static void validateCd(String cd) {
        if (!cd.startsWith("cd")) {
            throw new IllegalStateException("Command doesn't start with cd");
        }
    }

    private static String removeFirstSlash(String path) {
        if (path.startsWith(ROOT_PATH)) {
            return path.substring(1);
        }
        return path;
    }

    private static String[] getPathArray(String path) {
        return removeFirstSlash(path).split(SLASH_SEPARATOR);
    }

}
