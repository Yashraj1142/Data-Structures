class RotationSolution{
    boolean rotateString(String s, String goal){
        //checking lengths of both the strings
        if(s.length() != goal.length()){
            return false;
        }

        //creating a new string
        String newS = s+s;

        //checking if goal lies in newS
        if(newS.contains(goal)){
            return true;
        }

        return false;

        //or
        //return newS.contains(goal);
    }
}

public class Rotation {
    public static void main(String[] args) {
        RotationSolution r1 = new RotationSolution();

        String s = "abcde";
        String goal = "cdeab";
        System.out.println(r1.rotateString(s,goal));
    }
}
