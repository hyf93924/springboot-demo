/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author heyif
 * @since v1.0 2019-01-16T10:37
 */
public class StreamTest {

    public static void main(String[] args) {
        Property p1 = new Property("叫了个鸡", 1000, 500, 2);
        Property p2 = new Property("张三丰饺子馆", 2300, 1500, 3);
        Property p3 = new Property("永和大王", 580, 3000, 1);
        Property p4 = new Property("肯德基", 6000, 200, 4);
        List<Property> properties = Arrays.asList(p1,p2,p3,p4);

        //stream操作
        String name2 = properties.stream().sorted(Comparator.comparing(x->x.distance)).
                findFirst().get().name;
        System.out.println(name2);

        //filter
        long count = properties.stream().filter(p->p.distance>1000).count();
        System.out.println(count);
        System.out.println(properties.stream().filter(p->p.name.length()>5).count());

        //map
        System.out.println(properties.stream().map(property -> property.name));

        //max&min
        System.out.println(properties.stream().max(Comparator.comparing(p->p.priceLevel)).get().name);
        System.out.println(properties.stream().min(Comparator.comparing(p->p.priceLevel)).get().name);

        List<Property> list = properties.stream().
                sorted(Comparator.comparing(x->x.distance)).limit(2).collect(Collectors.toList());
        System.out.println(list.size());

        List<String> list1 = properties.stream().
                map(p->p.name).
                collect(Collectors.toList());
        System.out.println(list1);

        Map<String, Object> map = properties.stream().
                collect(Collectors.toMap(Property::getName, Property::getPriceLevel));
        System.out.println(map);

        Map<Integer, List<Property>> priceMap = properties.stream()
                .collect(Collectors.groupingBy(Property::getPriceLevel));
        System.out.println(priceMap);


        //stream并行流: parallelStream
        //等级小于4，距离排序的2个店铺
        properties.parallelStream()
                .filter(p->p.priceLevel<4)
                .sorted(Comparator.comparing(x->x.distance))
                .map(Property::getName)
                .limit(2)
                .collect(Collectors.toList());

    }
}
