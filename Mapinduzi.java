public class Mapinduzi {
        private String name;
        private int day;
        private String month;
 public Mapinduzi(String name, int day, String month) {
            this.name = name;
            this.day = day;
            this.month = month;
        }
        public String getName() {
            return name;
        }
         public int getDay() {
            return day;
        }
        public String getMonth() {
            return month;
        }
        public static double avgDate(Mapinduzi[] holidays) {
            int totalDays = 0;
    for (Mapinduzi holiday : holidays) {
                totalDays += holiday.getDay();
            }
     return (double) totalDays / holidays.length;
        }
        public static void main(String[] args) {
            Mapinduzi independenceDay = new Mapinduzi("Independence Day", 12, "January");
            System.out.println("Holiday Name: " + independenceDay.getName());
            System.out.println("Day: " + independenceDay.getDay());
            System.out.println("Month: " + independenceDay.getMonth());
        }
    }
