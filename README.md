# ML2 Editor

ML2 Editor is an Eclipse-based editor for model specification in ML2 (Multi-Level Modeling Language).

In order to compile the project, run 'mvn install' within the parent project. Then it will be possible to use the folder "../br.ufes.inf.nemo.ml2.parent/br.ufes.inf.nemo.ml2.repository/target/repository" as any Update Site for Eclipse IDE's. In other words, in a Eclipse IDE, go to "Help > Install New Software..." and Add the refered folder as update site.

In order to create models in ML2, create a file within any project within any project using ".ml2" as its format. For the first model created, a pop-up should appear asking to convert the project to a Xtext Nature. Select "yes" and start developing the model.

In order to use the default UFO library, add a Plug-in Nature to the project and add a dependency to the project "br.ufes.inf.nemo.ml2". This should allow direct references to the models "ml2.core.base", "ml2.core.endurant" and "ml2.core.meta".

Authrs:
  Claudemir M. Fonseca
