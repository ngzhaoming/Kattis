import java.io.*;
import java.util.*;

/**
 * Fast I/O
 * @source https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
 */
class FastIO extends PrintWriter 
{ 
    BufferedReader br; 
    StringTokenizer st;

    public FastIO() 
    { 
        super(new BufferedOutputStream(System.out)); 
        br = new BufferedReader(new
                InputStreamReader(System.in));
    } 

    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 

    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
}

class Quest {
    public static void main(String[] args) {
        FastIO fio = new FastIO();

        int num = fio.nextInt();
        TreeMap<Integer, PriorityQueue<Integer>> tree = new TreeMap<>();

        for(int i = 0; i < num; i++) {
            if(fio.next().equals("add")) {
                int energy = fio.nextInt();
                int gold = fio.nextInt();

                if(tree.containsKey(energy)) { //key already existed in tree
                    tree.get(energy).add(gold); //get the pq
                } else {
                    tree.put(energy, new PriorityQueue<>(num, Collections.reverseOrder()));
                    tree.get(energy).add(gold);
                } 
            } else {
                int x = fio.nextInt();
                long sum = 0;
                if (tree.floorKey(x) == null) {
                    fio.println(sum);
                } else {
                    while(tree.containsKey(tree.floorKey(x))) {
                        int key = tree.floorKey(x);
                        x -= key;
                        int value = tree.get(key).poll();
                        if(tree.get(key).peek()==null) {
                            tree.remove(key);
                        }
    
                        sum += value;
    
                        if(tree.floorKey(x)==null) {
                            fio.println(sum); 
                            break;
                        }
                    }
                }
            }
        }
        fio.close();
    }
}
