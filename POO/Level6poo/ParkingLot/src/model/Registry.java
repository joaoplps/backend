package model;

/**
 *
 * @author LPS
 */
class Registry {
    private int entryTime;
    private int leaveTime;
    private String plate;

    Registry(int entry, int leave) {
        entryTime = entry;
        leaveTime = leave;
    }
}
