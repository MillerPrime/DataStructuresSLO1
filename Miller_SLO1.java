/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miller_slo1;

/**
 *
 * @author bearb
 */

import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;

public class Miller_SLO1 {

    public static void main(String[] args) {

        // Create priority queues
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        PriorityQueue<String> queue2 = new PriorityQueue<>();

        // Add elements to queue1
        queue1.add("George");
        queue1.add("Jim");
        queue1.add("John");
        queue1.add("Blake");
        queue1.add("Kevin");
        queue1.add("Michael");
        queue1.add("Walter");
        queue1.add("Angel");

        // Add elements to queue2
        queue2.add("George");
        queue2.add("Katie");
        queue2.add("Kevin");
        queue2.add("Michelle");
        queue2.add("Ryan");
        queue2.add("Angel");

        // Convert to sets to remove duplicates
        Set<String> set1 = new HashSet<>(queue1);
        Set<String> set2 = new HashSet<>(queue2);

        // Union (no duplicates)
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        // Difference (items in set1 but not set2)
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        // Intersection
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Display the results
        System.out.println("Queue 1: " + set1);
        System.out.println("Queue 2: " + set2);

        System.out.println("\nUnion");
        System.out.println(union);

        System.out.println("\nDifference");
        System.out.println(difference);

        System.out.println("\nIntersection");
        System.out.println(intersection);
    }
}
