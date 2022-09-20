package Extra;


import Extra.ManipulateBounds;
import Extra.ManipulationEffect;


public class ManipulationEffectBuilderDual
{

      private final ManipulationEffect model;

      public ManipulationEffectBuilderDual(ManipulationEffect model)
      {
            this.model = model;
      }

      public ManipulationEffectBuilderDual params(ManipulateBounds option,int finish,int finish2)
      {
            model.setOption(option);
            model.setFinish(finish);
            model.setFinish2(finish2);
            return this;
      }

      public ManipulationEffect create()
      {
            return model;
      }

}