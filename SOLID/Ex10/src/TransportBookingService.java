public class TransportBookingService {
    private final DistanceCalculator dist;
    private final DriverAllocator alloc;
    private final PaymentGateway pay;

    public TransportBookingService(DistanceCalculator dist, DriverAllocator alloc, PaymentGateway pay) {
        this.dist = dist;
        this.alloc = alloc;
        this.pay = pay;
    }

    public void book(TripRequest req) {
        double km = dist.km(req.from, req.to);
        String driver = alloc.allocate(req.studentId);
        double fare = FareCalculationUtil.calculateFare(km);
        String txn = pay.charge(req.studentId, fare);
        BookingReceipt r = new BookingReceipt("R-501", fare);
        OutputPrinter.printOutput(km, driver, txn, r);
    }
}
