package com.swapnil;

import java.util.Collections;
import java.util.List;

public class CollectionsSortUtil {


    public List<Integer> sort(List<Integer> input) {

        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(j) < input.get(i)) {
                    Integer temp = input.get(i);
                    input.set(i, input.get(j));
                    input.set(j, temp);
                }
            }
        }
        return input;
    }
}
