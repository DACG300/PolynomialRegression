public class Printf {

    public void Print() {
        DataSet dataSet = new DataSet();
        double[] x = dataSet.getDataSetX();
        double[] y = dataSet.getDataSetY();

        PolynomialRegression linearModel = new PolynomialRegression(1);
        linearModel.fit(x, y);
        linearModel.printCoefficients();

        PolynomialRegression quadraticModel = new PolynomialRegression(2);
        quadraticModel.fit(x, y);
        quadraticModel.printCoefficients();


        PolynomialRegression cubicModel = new PolynomialRegression(3);
        cubicModel.fit(x, y);
        cubicModel.printCoefficients();


        double[] newValues = {58, 60, 65, 125, 150, 165};

        System.out.println("\nPredicciones: \n");
        System.out.println("Regresión Lineal:");
        for (double val : newValues) {
            System.out.println("Prediccion (" + val + ") = " + linearModel.predict(val));
        }

        System.out.println("\nRegresión Cuadrática:");
        for (double val : newValues) {
            System.out.println("Prediccion (" + val + ") = " + quadraticModel.predict(val));
        }

        System.out.println("\nRegresión Cúbica:");
        for (double val : newValues) {
            System.out.println("Prediccion (" + val + ") = " + cubicModel.predict(val));
        }



    }
}