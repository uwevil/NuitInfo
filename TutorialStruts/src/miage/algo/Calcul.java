package miage.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Calcul {
	public Calcul(Map<Integer, List<Double>> map){
		for (Integer key : map.keySet()){
			List<Double> list = map.get(key);
			list.add(list.get(2)-list.get(0));
		}
	}
	
	public List<List<Double>> QuiDoitRendreArgent(
			Map<Integer, List<Double>> map){
		List<List<Double>> result = 
				new ArrayList<List<Double>>();
		
		Map<Integer, Double> tabTmp = 
				new HashMap<Integer, Double>();
		List<Integer> listMax = new ArrayList<Integer>();
		List<Integer> listMin = new ArrayList<Integer>();
		
		for (Integer key : map.keySet()){
			if (map.get(key).get(3)>0){
				listMax.add(key);
				tabTmp.put(key, map.get(key).get(3));
			}else{
				listMin.add(key);
				tabTmp.put(key, map.get(key).get(3));
			}
		}
		
	//	Collections.sort(listMax);
	//	Collections.sort(listMin, Collections.reverseOrder());
		
	/*	for (int i=0;i<listMax.size();i++){
			for (int j=0; i<listMax.size();i++){
				
			}
		}
		*/
		while(listMax.size() != 0 && listMin.size() != 0){
			int keyMax = listMax.get(0);
			int keyMin = listMin.get(0);
			
			double valMax = tabTmp.get(keyMax);
			double valMin = tabTmp.get(keyMin);
			
			if (Math.abs(valMax)==Math.abs(valMin)){
				ArrayList<Double> array = new ArrayList<Double>();
				array.add((double) keyMin);
				array.add((double) keyMax);
				array.add(valMin);
				result.add(array);
				listMax.remove(0);
				listMin.remove(0);
				tabTmp.remove(keyMax);
				tabTmp.remove(keyMin);
			}else if (Math.abs(valMax)>Math.abs(valMin)){
				ArrayList<Double> array = new ArrayList<Double>();
				array.add((double) keyMin);
				array.add((double) keyMax);
				array.add(valMin);
				result.add(array);
				listMin.remove(0);
				tabTmp.remove(keyMin);
				tabTmp.put(keyMax, valMax-valMin);
				
				for (Integer key : tabTmp.keySet()){
					if (tabTmp.get(key)>0){
						listMax.add(key);
					}else{
						listMin.add(key);
					}
				}
				Collections.sort(listMax);
				Collections.sort(listMin, 
						Collections.reverseOrder());
			}else{
				ArrayList<Double> array = new ArrayList<Double>();
				array.add((double) keyMin);
				array.add((double) keyMax);
				array.add(valMin);
				result.add(array);
				listMax.remove(0);
				tabTmp.remove(keyMax);
				tabTmp.put(keyMin, valMin+valMax);
				
				for (Integer key : tabTmp.keySet()){
					if (tabTmp.get(key)>0){
						listMax.add(key);
					}else{
						listMin.add(key);
					}
				}
				Collections.sort(listMax);
				Collections.sort(listMin, 
						Collections.reverseOrder());
			}
		}
		
		return result;
	}
	
    public static void main(String[] args) {
    	Map<Integer, List<Double>> map = new HashMap<Integer,
    			List<Double>>();
    	ArrayList<Double> array = new ArrayList<Double>();
		array.add((double) 20);
		array.add((double) 0);
		array.add((double) 10);
		map.put(0, array);
		
		array = new ArrayList<Double>();
		array.add((double) 20);
		array.add((double) 0);
		array.add((double) 30);
		map.put(01, array);
		
		array = new ArrayList<Double>();
		array.add((double) 20);
		array.add((double) 0);
		array.add((double) 0);
		map.put(02, array);
		
		array = new ArrayList<Double>();
		array.add((double) 20);
		array.add((double) 0);
		array.add((double) 40);
		map.put(03, array);
		
		Calcul c = new Calcul(map);
		for (Integer key : map.keySet()){
			List<Double> list = map.get(key);
			System.out.println(list.get(0)+" "+list.get(1)
				+" "+list.get(2)+" "+list.get(3));
		}

		List<List<Double>> result = 
				c.QuiDoitRendreArgent(map);
		for (int i=0;i<result.size();i++){
			List<Double> list = result.get(i);
			System.out.println(list.get(0)+" doit "+list.get(1)
			+" : "+list.get(2));
		}
		
        Digraph G = new Digraph(4);
        for (int i=0; i<result.size();i++){
            G.addEdge(result.get(i).get(0).intValue(), result.get(i).get(1).intValue());
        }
        DirectedCycle finder = new DirectedCycle(G);

        if (finder.hasCycle()) {
            System.out.print("Directed cycle: ");
            List<Integer> listIds = new ArrayList<Integer>();
            for (int v : finder.cycle()) {
            	listIds.add(v);
            	System.out.print(v + " ");
            }
            Map<Double, Integer> mapDettes = new HashMap<Double, Integer>();
            for(int i=0; i<listIds.size();i++){
            	int pred = listIds.get(i);
            	int succ;
            	if (i==listIds.size()-1){
            		succ = listIds.get(0);
            	}else{
            		succ = listIds.get(i+1);
            	}
            	for (int j=0; j<result.size();j++){
        			List<Double> list = result.get(j);

            		if (list.get(0) == pred && list.get(1) == succ){
            			mapDettes.put(list.get(2), j);
            			break;
            		}
            	}
            }
            SortedSet<Double> keys = new TreeSet<Double>(mapDettes.keySet());
            for (Double key : keys) { 
            	int index = mapDettes.get(key);
            	List<Double> list = result.get(index);
            } 
            System.out.println();
        }
        else {
        	System.out.println("No directed cycle");
        }
        System.out.println();
		
    }
}
