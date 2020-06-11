package com.example.flink.job;

import com.example.flink.job.entity.Product;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

/**
 * @Date 2020/6/11 17:26
 * @Author 86131
 * @Description
 */
public class FileInputDeal {
    public static void main(String[] args) {
        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSet<Product> originData = env.readCsvFile("D:\\code\\myself\\flink\\backup\\data.csv").fieldDelimiter(",")
                .ignoreFirstLine()
                .includeFields(true, true, true, true, true, true, true, true, true)
                .pojoType(Product.class, "num", "name", "caption", "boxRule", "code", "effect", "type", "price", "lowPrice");
        try {
            originData.print();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
