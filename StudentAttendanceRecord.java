class StudentAttendanceRecord {
    public boolean checkRecord(String s) {
        int abs = 0;
        int consecutiveL = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                abs++;
                if (abs > 1) {
                return false;
                }
                consecutiveL = 0;
            } else if (ch == 'L') {
                consecutiveL++;
                if (consecutiveL > 2) return false;
            } else {
                consecutiveL = 0;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        StudentAttendanceRecord obj = new StudentAttendanceRecord();
    
        String test1 = "PPALLP";
        String test2 = "PPALLL";
        String test3 = "PPAALL";

        System.out.println("Test case 1: " + obj.checkRecord(test1));
        System.out.println("Test case 2: " + obj.checkRecord(test2)); 
        System.out.println("Test case 3: " + obj.checkRecord(test3)); 
    }
}
