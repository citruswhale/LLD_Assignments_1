# Steps:
1. We can split all the actions in terms of these 3 steps:
   - Validation
   - Formatting
   - Delivery
2. Modify Notification Sender class to handle validation, sending and logging seperately, so the subclasses only need to bother abt their specific work (validation/ sending)
3. Refactor each subclass to follow this new execution flow.
4. Subclasses define:
   – what they require
   – how they deliver
But they cannot change the overall contract.
5. For SMS, in validate itself, what they require is covered, so now, the subclass's contract defines explicitly what's needed and hence subject is intentionally skipped.
6. Similarly, no subclass assumes evrything to be present and only intentionally ignore unrequired things. Each subclass defines it requirements.
7. For WA, validation now goes into the validate method as a part of the flow.
8. For Email, we create a message normaliser which takes care of truncating the message. This makes the truncation intentional and explicit.
9. In the main orchestrator we truncate first using the util created then send the truncated msg into the email sender so email sender doesnt have to worry about pre conditions.