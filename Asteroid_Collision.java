/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Asteroid Collision
*Problem Source : Coding Ninjas
* 
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Asteroid_Collision{
    public static List< Integer > collidingAsteroids(int []asteroids) {
        //    Write your code here.
        Stack<Integer> s=new Stack<>();
        if(asteroids[0]==0){
            s.push(0);
        }
        outer: for(int i=0;i<asteroids.length;i++){
            if(s.isEmpty()){
                s.push(asteroids[i]);
                continue;
            }  
            
            while(!s.isEmpty() && asteroids[i]<0 && s.peek()>0){
                if(s.peek()>=0){
                    if(-1*asteroids[i]==s.peek()){
                        s.pop();
                        continue outer;
                    }else if(s.peek()>asteroids[i]*-1){
                        continue outer;
                    }else{
                        s.pop();
                        if(s.isEmpty()){
                            break;
                        }
                    }
                }else{
                    break;
                }
            }
            if(asteroids[i]!=0){
                s.push(asteroids[i]);
            }
            
        }
        return new ArrayList<>(s);
    }
}
