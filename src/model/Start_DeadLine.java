package model;

public class Start_DeadLine {
  private Date StartDate;
  private Date DeadLine;

  public Start_DeadLine(Date StartDate, Date DeadLine){
    this.StartDate = StartDate;
    this.DeadLine = DeadLine;
  }

  public Date getStartDate() {
    return StartDate;
  }

  public Date getDeadLine() {
    return DeadLine;
  }
  public void setStartDate(Date date){
    this.StartDate = date;
  }
  public void setDeadLine(Date date){
    this.DeadLine = date;
  }
  public boolean equals(Object obj){
    if(obj instanceof  Start_DeadLine){
      Start_DeadLine other = (Start_DeadLine) obj;
      return this.StartDate == other.StartDate && this.DeadLine == other.DeadLine;
    }
    return false;
  }
  public String toString(){
    return " StartDate: " + StartDate + " DeadLine: " + DeadLine;
  }
}
