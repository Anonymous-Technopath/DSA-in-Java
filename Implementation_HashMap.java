/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Implementation HashMap
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/implementation-hashmap_630343
* 
*/

import java.util.*;
public class Implementation_HashMap 
{
    ArrayList<String> K;
    ArrayList<Integer> V ;
    public myHashMap() 
    {
        // Implement the Constructor(s).
        K = new ArrayList<String>();
        V = new ArrayList<Integer>();
    }

    public void insert(String key, int value) 
    {
        // Implement the insert(k, v) function.
        if(K.contains(key)){
            V.set(K.indexOf(key),value);
        }else{
            K.add(key);
            V.add(value);
        }
    }

    public int get(String key) 
    {
        // Implement the get(k) function.
        if(!K.contains(key)){
            return -1;
        }
        return V.get(K.indexOf(key));
    }

    public void remove(String key) 
    {
        // Implement the remove(k) function.
        if(K.contains(key)){
            int x=K.indexOf(key);
            K.remove(x);
            V.remove(x);
        }
    }

    public boolean search(String key) 
    {
        // Implement the search(k) function. 
        return K.contains(key);
    }

    public int getSize() 
    {
        // Implement the getSize() function.
        return K.size();
    }

    public boolean isEmpty() 
    {
        // Implement the isEmpty() function.
        return K.size()==0;
    }

}
