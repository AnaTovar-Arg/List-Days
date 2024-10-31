package javal_list_day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WeekDay {
private List<String> days;

public WeekDay() {
    this.days = new ArrayList<>();
}
public void createDayList() {
    
    days.add("Lunes");
    days.add("Martes");
    days.add("Miércoles");
    days.add("Jueves");
    days.add("Viernes");
    days.add("Sábado");
    days.add("Domingo");
}

public List<String> getDaylist() {
return new ArrayList<>(days);
}

public int getDaysCount(){
    return days.size();
}
public boolean removeDay(String day){
    return days.remove(day);
}

public String getDay(int dayIndex) {
    if (dayIndex >= 0 && dayIndex < days.size()){
        days.get(dayIndex);
    }
    return null;
}

public boolean dayExists(String day) {
    return days.contains(day);
}
public void sortDaysAlphabetically() {
    Collections.sort(days);
}

public void clearDaysList() {
    days.clear();
}

}

