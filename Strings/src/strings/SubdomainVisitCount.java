package strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 * Leetcode We are given a list cpdomains of count-paired domains. We would like
 * a list of count-paired domains, (in the same format as the input, and in any
 * order), that explicitly counts the number of visits to each subdomain.
 *
 * @author anisha
 */
public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> allCpDomain = new ArrayList<>();
        HashMap<String, Integer> domainMap = new HashMap<>();

        for (String cpdomain : cpdomains) {
            int count = Integer.parseInt(cpdomain.split(" ")[0]);
            String domain = cpdomain.split(" ")[1];

            // parse each sub domain from top to bottom and add to the domainMap
            String[] subDomainKeys = domain.split("\\.");
            List<String> subDomainKeyList = Arrays.asList(subDomainKeys);
            int totalKeys = subDomainKeys.length;

            //Start stripping Strings from array and merge rest
            for (int i = 0; i < totalKeys; i++) {
                String currDomain = String.join(".", subDomainKeyList.subList(i, totalKeys));
                if (domainMap.containsKey(currDomain)) {
                    domainMap.put(currDomain, domainMap.get(currDomain) + count);
                } else {
                    domainMap.put(currDomain, count);
                }
            }
        }

        for (Map.Entry<String, Integer> mapentry : domainMap.entrySet()) {
            allCpDomain.add(mapentry.getValue() + " " + mapentry.getKey());
        }

        return allCpDomain;

    }
}
