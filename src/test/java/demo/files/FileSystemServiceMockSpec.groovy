package demo.files

import demo.MockStubApplication
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader,
        classes = [MockStubApplication])
class FileSystemServiceMockSpec extends Specification {

    def fileSystemService = Mock(FileSystem)

    def "mocking"() {
        when: 'I call the method'
        def result = fileSystemService.mkdir()

        then: 'I mock the result'
        1 * fileSystemService.mkdir() >> true

        and: 'Result is true'
        result == true
    }
}
