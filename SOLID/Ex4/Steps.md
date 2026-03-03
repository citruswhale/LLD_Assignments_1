# Steps:
1. Create enums/ class for prices (to remove hardcoding).
2. Create a pricingComponent Interface to enable future additions to pricingManager components.
3. Create the components for the different room types and add ons which return the encoded pricingManager value.
4. Make two lists of the add-on and room components and make a method to add to that list in a seperate class which manages all calculations and maintenance of these lists.
5. Add all specifications to the list.
6. Plug this pricingManager class to main and pass it to the orchestrator, HostelFeeCalculator and replace the switch things in the orchestrator and run main. 