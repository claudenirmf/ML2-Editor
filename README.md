# ML2 Editor

ML2 Editor is an Eclipse-based editor for model specification in ML2 (Multi-Level Modeling Language).

The ML2 Editor can be installed in any recent Eclipse release by copying this [link](https://raw.githubusercontent.com/nemo-ufes/ML2-Editor/release-branch/br.ufes.inf.nemo.ml2.parent/br.ufes.inf.nemo.ml2.repository/repository) into the field "Work with" at "Help > Install New Software...".

In order to create models in ML2, create a file within any project within any project using ".ml2" as its format. For the first model created, a pop-up should appear asking to convert the project to a Xtext Nature. Select "yes" and start developing the model.

In order to compile the project, run 'mvn install' within the parent project (OBS: the project's Maven future is temporarily unavalable due to an issue with the used version of Xtext).Then it will be possible to use the folder "../br.ufes.inf.nemo.ml2.parent/br.ufes.inf.nemo.ml2.repository/target/repository" as any Update Site for Eclipse IDE's. In other words, in a Eclipse IDE, go to "Help > Install New Software..." and Add the refered folder as update site.

As Eclipse Plug-in, all project's features are also available through the Eclipse IDE. Developrs interessed in working with this project should set the target file with the target project as "Active Target Platform". This ensures that your Eclipse installation take the correct dependencies into consideration. Additionally, in order to make the project available to be installed in other Eclipse instances, you should export the feature file into the "repository" folder within the repository project.

If want to know more about ML2 and Multi-Level Theory (MLT), please visit our group's [webpage](https://nemo.inf.ufes.br/projects/mlt/).

Authors:
  Claudemir M. Fonseca
