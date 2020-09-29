package com.example.designmode.demo.singleton.practice;

/**
 * @author george.zhang
 * @date 2020/9/29 14:31
 * @Description
 */
public class Triple {
    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private Integer id;
    private Triple(Integer id){
        this.id=id;
    }

    public static Triple getInstance(Integer id){
        return triples[id];
    }

    public Integer getId(){
        return id;
    }

}
