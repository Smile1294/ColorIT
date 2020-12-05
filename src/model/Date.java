package model;

public class Date {
  private int day;
  private int month;
  private int year;

  public Date(){

  }
  public Date(int day, int month, int year){
    set(day, month, year);
  }
  public void set(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }
  public Date copy(){
    return new Date(day,month,year);
  }
  public String toString(){
    return " day: " + day + " month: " + month + " year: " + year;
  }
}
