/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given parent-child relationships, determine the family members which have no 
 * parents or one parent. 
 * @author anisha
 */
public class ParentChildRelationship {
    public String[] getChildren(String[] queries) {
        //queries-> A B => a is parent of b
        HashMap<String, Integer> parentCountMap = new HashMap<>();
        int queryLen = queries.length;
        for(int i=0;i<queryLen; i++) {
            String query = queries[i];
            String parent = query.split(" ")[0];
            String child = query.split(" ")[1];
            if(!parentCountMap.containsKey(parent)) {
                parentCountMap.put(parent, 0);
            }
            if(parentCountMap.containsKey(child)) {
                parentCountMap.put(child, parentCountMap.get(child)+1);
            } else {
                parentCountMap.put(child, 1);
            }
        }
        
        List<String> resultList = new ArrayList<>();
        for(Map.Entry<String, Integer> child:parentCountMap.entrySet()) {
            if(child.getValue() != 2) {
                resultList.add(child.getKey());
            }
        }
        
        String[] resultArray = (String[]) resultList.toArray();
        //TODO
        return resultArray;
    }
}
