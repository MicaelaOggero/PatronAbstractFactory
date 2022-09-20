package Extra;


import Extra.ManipulateBounds;
import Extra.ManipulationEffect;

public final class ManipulationEffectBuilderSimple
{

      private final ManipulationEffect model;

      public ManipulationEffectBuilderSimple(ManipulationEffect model)
      {
            this.model = model;
      }

      public ManipulationEffectBuilderSimple params(ManipulateBounds option,int finish)
      {
            model.setOption(option);
            model.setFinish(finish);
            return this;
      }

      public ManipulationEffect create()
      {
            return model;
      }

}
