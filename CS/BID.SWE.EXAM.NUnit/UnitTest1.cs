using BID.SWE.EXAM.Impl;
using NUnit.Framework;

namespace BID.SWE.EXAM.NUnit
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void Test1()
        {
            var exercise1 = new Exercise1();

            var method1 = exercise1.Method1();

            Assert.NotNull(method1);
        }
    }
}