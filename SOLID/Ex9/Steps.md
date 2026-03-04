# Steps:
- The high level evaluation class depends on direct concrete classes of very particular implementations when we can have different implementations of the same actions using different ways later. Like saving to file vs db eg.
- So make generic interfaces which ensure abstraction between the low level concrete classes and the high level evaluation class.
- Then inject the deps in the constructor where the generalized interface types are used in place of the concrete classes.
- Then in main pass the implementations of the interfaces which we need. The concrete class choices should be made by the orchestrator main, not the evaluation class.
- The evaluation class's only job is to receive a set of these "tools" using which it can orchestrate the evaluation. These tools, even if their concrete implementations change later, shouldn't affect the evaluation class.
- Separation of concerns.