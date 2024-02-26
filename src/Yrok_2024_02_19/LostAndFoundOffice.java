package Yrok_2024_02_19;

public class LostAndFoundOffice {
    // создайте список things

    Object[] things = {null, null, null, null};

    // реализуйте метод put()
    public void put(Object object) {
        for (int i = 0; i < things.length; i++) {
            if (things[i] == null) {
                things[i] = object;
                return;
            }
        }

    }

    // реализуйте метод check()
    public boolean check(Object target) {
            for (Object object : things) {
                if (object!= null && object.equals(target)) {
                    return true;
                }
            }
        return false;
    }

}
