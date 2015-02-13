package org.nd.frequency;

/**
 * Единицы измерения частоты и конвертации для них.
 *
 * @author AlexeyVorobyev
 */
public enum FrequencyUnitEnum {

    Hz {
        public long toHz(int f) { return f; }

        public double toKHz(double f) { return f * 1000;}

        public double toMHz(double f) {return toKHz(f) * 1000;}

        public double convert(double f, FrequencyUnitEnum u) { return u.toHz((int) f);}
    },
    kHz {
        public long toHz(int f) {return f * 1000; }

        public double toKHz(double f) {return f;}

        public double toMHz(double f) {return f / 1000;}

        public double convert(double f, FrequencyUnitEnum u) {return u.toKHz(f);}
    },
    MHz {
        public long toHz(int f) { return (int) (toKHz(f) * 1000); }

        public double toKHz(double f) {return f * 1000;}

        public double toMHz(double f) {return f;}

        public double convert(double f, FrequencyUnitEnum u) { return u.toMHz(f);}
    };

    public long toHz(int f) { throw new AbstractMethodError(); }

    public double toKHz(double f) {throw new AbstractMethodError(); }

    public double toMHz(double f) {throw new AbstractMethodError();}

    public double convert(double f, FrequencyUnitEnum u) {throw new AbstractMethodError();}

}

