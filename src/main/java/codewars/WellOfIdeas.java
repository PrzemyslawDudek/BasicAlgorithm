package codewars;

public class WellOfIdeas {
    public String well(String[] x) {
        int goodIdea = 0;
        for (String s : x) {
            if (s.equals("good")) {
                goodIdea++;
            }
        }
        if (goodIdea < 1) {
            return "Fail!";
        } else if (goodIdea < 3) {
            return "Publish!";
        } else {
            return "I smell a series!";
        }
    }
}
