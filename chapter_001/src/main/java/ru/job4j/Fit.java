package ru.job4j;

/** Программа расчета идеального веса.
 */
public class Fit {


          /**
         * Идеальный вес для мужщины.
         *
         * @param height Рост.
         * @return идеальный вес.
         */
        public double manWeight ( double height){
            // Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
            double idealWeight = (height - 100) * 1.15;
            return idealWeight;
        }

        /**
         * Идеальный вес для женщины.
         * @param height Рост.
         * @return идеальный вес.
         */
        public double womanWeight ( double height){
            double idealWeight = (height - 110) * 1.15;
            return idealWeight;

        }
    }