package CommandNodes;

import Handlers.HandlerInterfaces.CommandHandlerInterface;

public class OrNode extends TurtleCommandNode {
   private static final int BOOLEAN_PARAMS = 2;


   public OrNode(CommandHandlerInterface inHandler) {
      super(inHandler);
      this.setMyNumParams(BOOLEAN_PARAMS);
   }

   public OrNode(CommandHandlerInterface inHandler, CommandNode inParent) {
      super(inHandler, inParent);
      this.setMyNumParams(BOOLEAN_PARAMS);
   }

   public void execute() {
      this.parseParameters();
      this.setMyReturnValue(this.returnVal());
   }

   private double returnVal(){
      if(this.getMyChildren().get(0).getMyReturnValue() != 0 || this.getMyChildren().get(1).getMyReturnValue() != 0)
         return 1.0;
      return 0.0;
   }
   protected void parseParameters() {
   }
}