import abc

class Command(metaclass = abc.ABCMeta):

    @abc.abstractmethod
    def execute(self):
        pass

    @abc.abstractmethod
    def unexecute(self):
        pass
