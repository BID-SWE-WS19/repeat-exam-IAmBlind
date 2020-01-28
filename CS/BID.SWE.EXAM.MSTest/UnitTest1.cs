using BID.SWE.EXAM.Impl;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace BID.SWE.EXAM.MSTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            var exercise1 = new Exercise1();

            var method1 = exercise1.Method1();

            Assert.IsNotNull(method1);
        }
    }
}
