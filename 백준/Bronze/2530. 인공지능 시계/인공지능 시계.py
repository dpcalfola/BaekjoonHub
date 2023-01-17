import sys


class Clock:

    def __init__(self, hour=0, minute=0, second=0):
        self.hour: int = hour
        self.minute: int = minute
        self.second: int = second

        # Raise an exception if input clock fields are overflows
        if hour >= 24 or hour < 0:
            raise ValueError("Hour should be in range [0, 23]")
        if minute >= 60 or minute < 0:
            raise ValueError("Minute should be in range [0, 59]")
        if second >= 60 or second < 0:
            raise ValueError("Second should be in range [0, 59]")

    def __str__(self):
        return f"{self.hour} {self.minute} {self.second}"

    def handle_overflow(self):
        """
        Note:
        A Clock object's fields have already checked on __init__ method
        Because of this, we don't need to check overflow again on this method
        :return:
        """

        # Positive overflow
        if self.second >= 60:
            self.second -= 60
            self.minute += 1
        if self.minute >= 60:
            self.minute -= 60
            self.hour += 1
        if self.hour >= 24:
            self.hour -= 24

        # Negative overflow
        if self.second < 0:
            self.second += 60
            self.minute -= 1
        if self.minute < 0:
            self.minute += 60
            self.hour -= 1
        if self.hour < 0:
            self.hour += 24

    def __add__(self, other_clock: 'Clock') -> 'Clock':
        """

        ATTENTION:
        - Type hinting annotation should be written in single quotes

        Note:
        - This method is called when you use '+' operator
        - After adding, this method calls handle_overflow() method

        :param other_clock:
        :return:
        """

        self.hour += other_clock.hour
        self.minute += other_clock.minute
        self.second += other_clock.second

        self.handle_overflow()

        return Clock(self.hour, self.minute, self.second)


# The Problem gives an input as only second unit value, range 0 to 500000
# So, Input second value should be created Clock object with this method
def sec_to_clock_obj(param_seconds: int) -> Clock:
    """
    Convert seconds to Clock object

    Note:
    When Clock object created at return statement,
    constructor is going to check overflow of fields
    So It is ok to skip checking overflows

    Attention:
    {hours} Should be removed days

    :param param_seconds: given input value for calculate target as second unit
    :return: Clock object
    """

    # Declare variables type hinting annotation
    days: int
    hours: int
    minutes: int
    seconds: int
    reminded_days: int
    reminded_hours: int

    # Time units
    day_sec: int = 24 * 60 * 60
    hour_sec: int = 60 * 60
    min_sec: int = 60

    # divmod() returns quotient(몫) and remainder(나머지) as tuple
    # divmod(__x, __y) -> (__x // __y, __x % __y)

    # Calculate days
    days, reminded_days = divmod(param_seconds, day_sec)
    hours, reminded_hours = divmod(reminded_days, hour_sec)
    minutes, seconds = divmod(reminded_hours, min_sec)

    return Clock(hours, minutes, seconds)


def solving_method() -> 'Clock':
    init_hour: int  # This line is type hinting annotation
    init_minute: int
    init_second: int
    init_hour, init_minute, init_second = map(int, sys.stdin.readline().rstrip().split())
    target_second: int = int(sys.stdin.readline().rstrip())

    # Create Clock objects
    init_clock: Clock = Clock(init_hour, init_minute, init_second)
    target_clock: Clock = sec_to_clock_obj(target_second)

    # Add two Clock objects
    result_clock: Clock = init_clock + target_clock

    # Print result with __str__ method
    return result_clock


print(solving_method())
