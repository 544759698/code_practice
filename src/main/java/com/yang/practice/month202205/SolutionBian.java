package com.yang.practice.month202205;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @Author: yangguojun01
 * @Date: 2022/5/26
 */
public class SolutionBian {
    public static void main(String[] args) {
        List<DataItem> inputList = new ArrayList<>();
        inputList.add(new DataItem("20220501", 32, 50));
        inputList.add(new DataItem("20220502", 31, 49));
        inputList.add(new DataItem("20220503", 33, 51));
        List<Point> ret = transfer(inputList);
        System.out.println(ret);
    }

    public static List<Point> transfer(List<DataItem> input) {
        List<Point> ret = new ArrayList<>();
        Point uv = new Point("uv");
        uv.setxAxis(input.stream().map(i -> Long.parseLong(i.getDt())).collect(Collectors.toList()));
        uv.setyAxis(input.stream().map(i -> i.getUv()).collect(Collectors.toList()));
        ret.add(uv);
        Point pv = new Point("pv");
        pv.setxAxis(input.stream().map(i -> Long.parseLong(i.getDt())).collect(Collectors.toList()));
        pv.setyAxis(input.stream().map(i -> i.getPv()).collect(Collectors.toList()));
        ret.add(pv);
        return ret;
    }

}

class DataItem {
    private String dt;
    private int uv;
    private int pv;

    public DataItem(String dt, int uv, int pv) {
        this.dt = dt;
        this.uv = uv;
        this.pv = pv;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
}

class Point {
    private String title;
    private List<Long> xAxis;
    private List<Integer> yAxis;

    public Point() {
    }

    public Point(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Long> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List<Long> xAxis) {
        this.xAxis = xAxis;
    }

    public List<Integer> getyAxis() {
        return yAxis;
    }

    public void setyAxis(List<Integer> yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public String toString() {
        return "title=\"" + title + '\"' +
                ", xAxis=" + xAxis +
                ", yAxis=" + yAxis;
    }
}
