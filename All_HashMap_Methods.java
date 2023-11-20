import java.util.*;

class HashMapCode{
    // It is implementedd with an Array of LinkedList
    // It's time complexity is O(1) but 
    // In rarecase worst case time complexity is O(n)
    static class HashMap<K,V>{ // generics
        class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n; // total number of nodes
        private int N; // bucket length
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        HashMap(){
            this.N=4;
            this.buckets=new LinkedList[N]; // by default null will be there
            
            for(int i=0;i<N;i++){
                this.buckets[i]=new LinkedList<>(); // initializing empty linkedlist in place of null because we can't attach LinkedList to null
            }
        }

        int hashFunction(K key){ // (blackbox) it will return bucket index
            int bi=key.hashCode(); // give both -ve and +ve values
            return Math.abs(bi)%N; //modulus to return value from 1 to N-1 only
        }

        int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key.equals(key)){
                    return i; // i.e di
                }
            }
            return -1;                  
        }

        void rehash(){
            LinkedList<Node>[] oldBucket=buckets;
            buckets=new LinkedList<>(N*2);
            
            for(int i=0;i<N*2;i++){ // initializing the new linkedlist with zero
                buckets[i]= new LinkedList<>();
            }


            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        void put(K key,V value){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); // return data index

            if(di==-1){ // key doesn't exist
                buckets[bi].add(new Node(key,value));
                n++;
            }else{ // key existsk
                Node data=buckets[bi].get(di);
                data.value=value;
            }

            double lambda=(double)n/N;
            if(lambda>2.0){
                // rehashing    
            }
        }

        boolean containsKey(K key){
            // half same as put
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); // return data index

            // if(di==-1){ // key doesn't exist
            //     return false;
            // }else{ // key existsk
            //     return true;
            // }

            return di != -1;
        }

        V get(K key){
            // half same as put
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); // return data index

            if(di==-1){ // key doesn't exist
                return null;
            }else{ // key existsk
                Node data=buckets[bi].get(di);
                return data.value;
            }
        }

        V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); // return data index

            if(di==-1){ // key doesn't exist
                return null;
            }else{ // key existsk
                Node data=buckets[bi].remove(di); // this is not recursion, this remove is for LinkedList
                n--; // decreasing size as well
                return data.value;
            }
        }

        ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node =ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        boolean isEmpty(){
            return n==0;
        }

        
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        map.put("US",90);
        ArrayList<String> keys=map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India")); 
    }
}

public class All_HashMap_Methods {
    public static void main(String[] args) {
        // Creating a HashMap
            Map<String, Integer> hashMap = new HashMap<>();

        // 1. put(K key, V value)
            hashMap.put("John", 25);
            hashMap.put("Jane", 30);
            hashMap.put("Doe", 40);

        // 2. get(Object key)
            // System.out.println("Age of John: " + hashMap.get("John"));

        // 3. containsKey(Object key)
            // System.out.println("Contains key 'Alice': " + hashMap.containsKey("Alice"));

        // 4. containsValue(Object value)
            // System.out.println("Contains value 30: " + hashMap.containsValue(30));

        // 5. size()
            // System.out.println("Size of HashMap: " + hashMap.size());

        // 6. keySet()
            System.out.println("Keys: " + hashMap.keySet());

        // 7. values()
            // System.out.println("Values: " + hashMap.values());

        // 8. remove(Object key)
            // hashMap.remove("Jane");
            // System.out.println("After removing Jane: " + hashMap);

        // 9. clear()
            // hashMap.clear();
            // System.out.println("After clearing: " + hashMap);

        // 10. Iterator 
            // for(Map.Entry<String,Integer> e:hashMap.entrySet()){
            //     System.out.println(e.getKey());
            //     System.out.println(e.getValue());
            // }

            // or

            // Set<String> keys = hashMap.keySet();
            // for(String key:keys){
            //     System.out.println(key+" "+hashMap.get(key));
            // }
    }
}

class findItineraryFromTickets{

    static String getStart(HashMap<String,String> tickets){ // this will give starting ticket
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:tickets.keySet()){
            // key -> key ; val -> tickers.get(key)
            revMap.put(tickets.get(key),key);
        }

        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");


        String start=getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start=tickets.get(start);
        }
        System.out.print(start+" End!");
    }
}

class SubarraySumEqualToK{
    public static void main(String[] args) {
        // we need to find array such that sum(i to j)=k
        /*Explanation
            int[] arr=[1,2,-3,4,5,6,7] ;k=6
                           i,  j 
            K=sum(j)-sum(i-1)
            sum(j)-K=sum(i-1)  and here sum(i-1) found before the sum(j)
        */
        int[] arr ={10,2,-2,-20,10}; // ans=3
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){ // checking sum(j)-K
                ans+=map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}