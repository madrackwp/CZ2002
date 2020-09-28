public abstract class PhoneB extends PhoneA implements IntPhoneA, IntPhoneB {
    public void send(String m, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(m);
        }
    }
}
