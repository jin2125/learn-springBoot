package org.springboot.learn.annotation;

import org.springboot.learn.annotation.Apple;

import java.lang.reflect.Field;

public class AppleAnnotation {

    public static void main(String[] args) {
        Field[] fields = Apple.class.getDeclaredFields();
        for (Field field : fields) {
            //System.out.println(field.getName().toString());
            if (field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println("水果的名称：" + fruitName.value());
            }else if (field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println("水果的颜色："+fruitColor.fruitColor());
            }
        }
    }

}
