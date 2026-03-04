# Steps:
- Ofc like the previous ex, create abstractions using interface so the main orchestrator (Transport booking service is agnostic of the specifics concrete implementations of its helpers).
- The output and pricing calculation is also done by the orchestrator which violates SRP, so fix that by creating an output printer and a fareCalculator.
- Use DIs when the deps are external or replaceable behaviors/ needs testability/ could change across environments, vs use static methods when with stateless deterministic functions.
- Main reasoning between DI and static methods (Got this question in case of output printer, should I inject or use a static method): stateless deterministic functions. 
- Since output printing here is a utility and not a behavior, I'm going with static. 
- But if this were to be extended and ConsolePrinter, FilePrinter, LoggerPrinter, etc were introduced, then we convert printing into a behavior, so in that case we'll need to make this a DI.