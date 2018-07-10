import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.fleetrentallog4jsample.model.business.AllBusinessTests;
import com.fleetrentallog4jsample.model.domain.AllDomainTestSuite;
import com.fleetrentallog4jsample.model.services.AllServicesTestSuite;


@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class, AllServicesTestSuite.class, AllDomainTestSuite.class})
public class ApplicationTestSuite {

}
