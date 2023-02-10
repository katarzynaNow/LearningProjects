package javaProjects.dataProviders;

public class DataProviderApp {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider();
        //DataProvider dataProvider = new SimpleDataProvider();

        dataPresenter.showData(dataProvider);
    }
}
