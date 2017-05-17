package br.ufes.inf.nemo.ml2.util;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ML2ValueConverter extends DefaultTerminalConverters {
  @ValueConverter(rule = "ELEMENTBOUND")
  public IValueConverter<Integer> ElementBound() {
    return new IValueConverter<Integer>() {
      @Override
      public String toString(final Integer value) {
        if (((value).intValue() == (-1))) {
          return "*";
        } else {
          return Integer.toString((value).intValue());
        }
      }
      
      @Override
      public Integer toValue(final String string, final INode node) throws ValueConverterException {
        boolean _isEmpty = Strings.isEmpty(string);
        if (_isEmpty) {
          throw new ValueConverterException("Couldn\'t convert empty string to an integer", node, null);
        } else {
          String _trim = string.trim();
          boolean _equals = "*".equals(_trim);
          if (_equals) {
            return Integer.valueOf((-1));
          } else {
            try {
              return Integer.valueOf(Integer.parseInt(string));
            } catch (final Throwable _t) {
              if (_t instanceof NumberFormatException) {
                final NumberFormatException e = (NumberFormatException)_t;
                throw new ValueConverterException((("Couldn\'t convert the string \'" + string) + "\' to an integer."), node, e);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
        }
      }
    };
  }
  
  @ValueConverter(rule = "BOOLEAN")
  public IValueConverter<Boolean> Boolean() {
    return new IValueConverter<Boolean>() {
      @Override
      public String toString(final Boolean value) {
        if ((value).booleanValue()) {
          return "true";
        } else {
          return "false";
        }
      }
      
      @Override
      public Boolean toValue(final String string, final INode node) throws ValueConverterException {
        boolean _isEmpty = Strings.isEmpty(string);
        if (_isEmpty) {
          throw new ValueConverterException("Couldn\'t convert an empty string to a boolean.", node, null);
        } else {
          String _trim = string.trim();
          boolean _equals = "true".equals(_trim);
          if (_equals) {
            return Boolean.valueOf(true);
          } else {
            String _trim_1 = string.trim();
            boolean _equals_1 = "false".equals(_trim_1);
            if (_equals_1) {
              return Boolean.valueOf(false);
            } else {
              throw new ValueConverterException((("Couldn\'t convert the string \'" + string) + "\' to a boolean."), node, null);
            }
          }
        }
      }
    };
  }
  
  @ValueConverter(rule = "NUMBER")
  public IValueConverter<Double> Number() {
    return new IValueConverter<Double>() {
      @Override
      public String toString(final Double value) throws ValueConverterException {
        return value.toString();
      }
      
      @Override
      public Double toValue(final String string, final INode node) throws ValueConverterException {
        boolean _isEmpty = Strings.isEmpty(string);
        if (_isEmpty) {
          throw new ValueConverterException("Couldn\'t convert empty string to a number.", node, null);
        } else {
          try {
            String _trim = string.trim();
            return Double.valueOf(Double.parseDouble(_trim));
          } catch (final Throwable _t) {
            if (_t instanceof NumberFormatException) {
              final NumberFormatException e = (NumberFormatException)_t;
              throw new ValueConverterException((("Couldn\'t convert the string \'" + string) + "\' to a number."), node, e);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
    };
  }
}
