/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking.comchallenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class HotelReview {

    /*
     * Complete the function below.
     */
    static int[] sort_hotels(String keywords, int[] hotel_ids, String[] reviews) {
        String[] keywordArray = keywords.split(" ");
        int totalReview = hotel_ids.length;
        HashMap<Integer, Integer> hotelReviewCount = new HashMap<>();
        for (int i = 0; i < totalReview; i++) {
            List<String> reviewList = Arrays.asList(reviews[i].split(" "));
            System.out.println("ReviewList:"+ reviewList);
            int reviewCount = 0;
            for (String key : keywordArray) {
                //System.out.println("Key:"+key+", frequency:"+Collections.frequency(reviewList, key));
                reviewCount += Collections.frequency(reviewList, key);
            }
            System.out.println("Review count:"+ reviewCount);
            if (hotelReviewCount.containsKey(hotel_ids[i])) {
                hotelReviewCount.put(hotel_ids[i], hotelReviewCount.get(hotel_ids[i]) + reviewCount);
            } else {
                hotelReviewCount.put(hotel_ids[i], reviewCount);
            }
        }

        int len = hotelReviewCount.size();
        Hotel hotels[] = new Hotel[len];
        int i = 0;
        for(java.util.Map.Entry<Integer,Integer> record:hotelReviewCount.entrySet()) {
            hotels[i++] = new Hotel(record.getKey(), record.getValue());
        }
        
        Arrays.sort(hotels);
        int hotelIds[] = new int[len];
        for(int j=0;j<len;j++) {
            hotelIds[j] = hotels[j].id;
        }
        
        return hotelIds;
        

    }
    
    static class Hotel implements Comparable<Hotel>{
        int id;
        int review;
        public Hotel(int id, int review) {
            this.id = id;
            this.review = review;
        }

        @Override
        public int compareTo(Hotel o) {
            return o.review - review;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        } else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int[] res;
        String keywords;
        try {
            keywords = in.nextLine();
        } catch (Exception e) {
            keywords = null;
        }

        int hotel_ids_size = 0;
        hotel_ids_size = Integer.parseInt(in.nextLine().trim());

        int[] hotel_ids = new int[hotel_ids_size];
        for (int i = 0; i < hotel_ids_size; i++) {
            int hotel_ids_item;
            hotel_ids_item = Integer.parseInt(in.nextLine().trim());
            hotel_ids[i] = hotel_ids_item;
        }

        int reviews_size = 0;
        reviews_size = Integer.parseInt(in.nextLine().trim());

        String[] reviews = new String[reviews_size];
        for (int i = 0; i < reviews_size; i++) {
            String reviews_item;
            try {
                reviews_item = in.nextLine();
            } catch (Exception e) {
                reviews_item = null;
            }
            reviews[i] = reviews_item;
        }

        res = sort_hotels(keywords, hotel_ids, reviews);
        for (int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
