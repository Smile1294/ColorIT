package model;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Start_DeadLine
{
  private MyDate StartDate;
  private MyDate DeadLine;

  public Start_DeadLine(MyDate StartDate, MyDate DeadLine)
  {
    this.StartDate = StartDate;
    this.DeadLine = DeadLine;
  }

  public MyDate getStartDate()
  {
    return StartDate;
  }

  public MyDate getDeadLine()
  {
    return DeadLine;
  }

  public void setStartDate(MyDate date)
  {
    this.StartDate = date;
  }

  public void setDeadLine(MyDate date)
  {
    this.DeadLine = date;
  }

  public int IntervalInDays(MyDate startDate, MyDate deadLine)
  {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
    startDate.toStringforDays();
    deadLine.toStringforDays();
    LocalDate date1 = LocalDate.parse(startDate.toStringforDays(), dtf);
    LocalDate date2 = LocalDate.parse(deadLine.toStringforDays(), dtf);
    long daysBetween = Duration.between(date1, date2).toDays();
    int days = Integer.parseInt(String.valueOf(daysBetween));
    return days;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Start_DeadLine)
    {
      Start_DeadLine other = (Start_DeadLine) obj;
      return this.StartDate == other.StartDate
          && this.DeadLine == other.DeadLine;
    }
    return false;
  }

  public String toString()
  {
    return " StartDate: " + StartDate + " DeadLine: " + DeadLine;
  }
}
