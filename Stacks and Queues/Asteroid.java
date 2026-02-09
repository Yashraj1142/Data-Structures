import java.util.*;

class AsteroidSolution {
    int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int num : asteroids) {
            boolean destroyed = false;
            while (!(s.isEmpty()) && s.peek() > 0 && num < 0) {
                if(Math.abs(s.peek()) < Math.abs(num)){
                    s.pop();
                    continue;
                }
                else if(s.peek() == Math.abs(num)){
                    s.pop();    //both destroyed
                }
                destroyed = true;
                break;
            }
            if(!destroyed){
                s.push(num);
            }
        }

        int[] res = new int[s.size()];
        for (int i = s.size()-1; i>=0; i--) {
            res[i] = s.pop();
        }

        return res;
    }
}

public class Asteroid {
    public static void main(String[] args) {
        AsteroidSolution a1 = new AsteroidSolution();
        int[] asteroids = { 5, 10, -5 };

        int[] result = a1.asteroidCollision(asteroids);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
