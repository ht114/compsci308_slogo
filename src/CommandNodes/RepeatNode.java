package CommandNodes;

import Handlers.HandlerInterfaces.CommandHandlerInterface;

public class RepeatNode extends CommandNode {


   public RepeatNode(CommandHandlerInterface inHandler){
      super(inHandler);
   }

   public RepeatNode(CommandHandlerInterface inHandler, CommandNode inParent){
      super(inHandler, inParent);
   }

   public void execute(){
      this.parseParameters();
   }

   public boolean childrenFilled(){
      for(CommandNode c: this.getMyChildren()){
         if(c instanceof RightBracketNode){
            return true;
         }
      }
      return false;
   }

   private Double getLastReturnValue(){
      int index = this.getMyChildren().size()-2;
      return this.getMyChildren().get(index).getMyReturnValue();
   }

   protected void parseParameters(){
      this.setMyNumRepeat(this.getNextDouble());
   }

}
