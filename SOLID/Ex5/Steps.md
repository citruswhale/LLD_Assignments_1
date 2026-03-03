# Steps:
1. Create pre and post conditions with null checks to ensure only logic remains inside the implementable method.
2. Remove null checks and error throwing from within the extended classes, keeping it purely logical.
3. For PdfExporter, since there is a specific error being thrown, ensure it isnt touching the main logic/ extended class. 
4. To do that, create a constrained exporter which handles delivery constraints seperately and make PdfExporter extend that instead. 
5. Mindset of approach:
   - Subclass shouldn't restrict superset
   - Subclass shouldn't handle generic violations like returning null differently (like empty byte array instead of null, etc).
   - Subclass shouldn't have more than what is indicated by the superclass (like formatting + Delivery restrictions)
   - Subclass shouldn't need special handling.