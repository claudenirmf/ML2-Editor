/**
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ml2;

import br.ufes.inf.nemo.ml2.AbstractML2RuntimeModule;
import br.ufes.inf.nemo.ml2.util.ML2ValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class ML2RuntimeModule extends AbstractML2RuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return ML2ValueConverter.class;
  }
}
