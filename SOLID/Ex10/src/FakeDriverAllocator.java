public class FakeDriverAllocator implements DriverAllocator{
    @Override
    public String allocate(String studentId) {
        // fake deterministic driver
        return "DRV-17";
    }
}
